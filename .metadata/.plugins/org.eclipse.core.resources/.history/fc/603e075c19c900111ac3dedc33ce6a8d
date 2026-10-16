package com.klef.soa.exam.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "museum_membership")
public class MuseumMembership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String memberName;

    @Column(nullable = false)
    private String membershipType;

    @Column(nullable = false)
    private String startDate;

    @Column(nullable = false)
    private double annualFee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(double annualFee) {
        this.annualFee = annualFee;
    }

    @Override
    public String toString() {
        return "MuseumMembership [id=" + id
                + ", memberName=" + memberName
                + ", membershipType=" + membershipType
                + ", startDate=" + startDate
                + ", annualFee=" + annualFee + "]";
    }
}
