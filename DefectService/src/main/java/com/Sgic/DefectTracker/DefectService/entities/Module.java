package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity

@Table( name = "module")
public class Module implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long module_id;
	private String module_name;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "project_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Project project;
	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	private Set<SubModule> subModule;

	public long getModule_id() {
		return module_id;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setModule_id(long module_id) {
		this.module_id = module_id;
	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Set<SubModule> getSubModule() {
		return subModule;
	}

	public void setSubModule(Set<SubModule> subModule) {
		this.subModule = subModule;
	}
}
