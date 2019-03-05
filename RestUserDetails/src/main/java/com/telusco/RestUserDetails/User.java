package com.telusco.RestUserDetails;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User 

{
		Integer id;
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", profession=" + profession + ", place=" + place + "]";
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		String name;
		String profession;
		String place;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		
}
