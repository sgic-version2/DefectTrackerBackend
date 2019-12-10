package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "submodule")
public class SubModule implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long submodule_id;

	private String submodule_name;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "module_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Module module;

	public long getSubmodule_id() {
		return submodule_id;
	}

	public void setSubmodule_id(long submodule_id) {
		this.submodule_id = submodule_id;
	}

	public String getSubmodule_name() {
		return submodule_name;
	}

	public void setSubmodule_name(String submodule_name) {
		this.submodule_name = submodule_name;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}
