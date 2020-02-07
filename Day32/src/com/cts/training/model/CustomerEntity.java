package com.cts.training.model;

public class CustomerEntity {

		private int id;
		private String name;
		private String address;
		private AccountEntity account;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public AccountEntity getAccount() {
			return account;
		}
		public void setAccount(AccountEntity account) {
			this.account = account;
		}
		@Override
		public String toString() {
			return "CustomerEntity [id=" + id + ", name=" + name + ", address=" + address + ", account=" + account
					+ "]";
		}
		
		
}
