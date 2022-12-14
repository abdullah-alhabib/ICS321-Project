package com.example.ics321;

import java.util.Date;

public class Packages {
    int packageId;
    float weight;
    float width;
    float height;
    float depth;
    float insuranceAmount;
    String destination;
    Date deliveryDate;
    int costumerId;
    float cost;
    String type;
    String status;



    public Packages(int packageId, float weight, float width, float height, float depth, float insuranceAmount, String destination, Date deliveryDate, int costumerId, float cost , String status, String type) {
        this.packageId = packageId;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.insuranceAmount = insuranceAmount;
        this.destination = destination;
        this.deliveryDate = deliveryDate;
        this.costumerId = costumerId;
        this.cost = cost;
        this.status=status;
    }
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(float insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(int costumerId) {
        this.costumerId = costumerId;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }


}
