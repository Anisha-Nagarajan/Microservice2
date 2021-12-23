package com.store.order1service.Entity;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table (name = "orders")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    private BigDecimal total;
    private int userid;
    
    public Order() {
		
	}
    

	public Order(int id, String status, BigDecimal total, int userid) {
        this.id = id;
        this.status = status;
        this.total = total;
        this.userid = userid;
    }


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}


    @Override
    public String toString() {
        return "Order [id=" + id + ", status=" + status + ", total=" + total + ", userid=" + userid + "]";
    }




	
}