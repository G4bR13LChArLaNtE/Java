package com.dev.charlante.cadastroapp.models;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="to_item")

public class ToItemMoldel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	public Long id;
	
	
	@Getter
	@Setter
	public String description;
	
	
	@Getter
	@Setter
	public boolean complete;
	
	
	@Getter
	@Setter
	public Instant createdDate;
	
	
	@Getter
	@Setter
	public Instant modifiedDate;
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isComplete() {
		return complete;
	}


	public void setComplete(boolean complete) {
		this.complete = complete;
	}


	public Instant getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}


	public Instant getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public ToItemMoldel(){}
	
	
	public ToItemMoldel(String description) {
		this.description = description;
		this.complete = false;
		this.createdDate = Instant.now();
		this.modifiedDate = Instant.now();
	}
	
	
	@Override
	public String toString() {
		return String.format("ToItem{id = %d, description = '%s', complete = '%s', createdDate ='%s', modifiedDate = '%s'}", id,description,complete,createdDate, modifiedDate);
	}

}
