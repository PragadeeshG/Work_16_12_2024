package com.test1;

public class StripePaymentDetailsAmendmentSteps {
	private Integer crId;
	private String paramsOfCr;
	private String crStatus;
	private String crApproved;
	private String pendingOn;
	private String grpName;
	private String grpCategory;
	private String startAction;
	private String endAction;
	private String startTime;
	private String endTime;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public StripePaymentDetailsAmendmentSteps() {

	}

	public StripePaymentDetailsAmendmentSteps(Integer crId, String paramsOfCr, String crStatus, String crApproved,
			String pendingOn, String grpName, String grpCategory, String startAction, String endAction,
			String startTime, String endTime, String creationDate, String modifiedDate, String entityState) {
		super();
		this.crId = crId;
		this.paramsOfCr = paramsOfCr;
		this.crStatus = crStatus;
		this.crApproved = crApproved;
		this.pendingOn = pendingOn;
		this.grpName = grpName;
		this.grpCategory = grpCategory;
		this.startAction = startAction;
		this.endAction = endAction;
		this.startTime = startTime;
		this.endTime = endTime;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCrId() {
		return crId;
	}

	public void setCrId(Integer crId) {
		this.crId = crId;
	}

	public String getParamsOfCr() {
		return paramsOfCr;
	}

	public void setParamsOfCr(String paramsOfCr) {
		this.paramsOfCr = paramsOfCr;
	}

	public String getCrStatus() {
		return crStatus;
	}

	public void setCrStatus(String crStatus) {
		this.crStatus = crStatus;
	}

	public String getCrApproved() {
		return crApproved;
	}

	public void setCrApproved(String crApproved) {
		this.crApproved = crApproved;
	}

	public String getPendingOn() {
		return pendingOn;
	}

	public void setPendingOn(String pendingOn) {
		this.pendingOn = pendingOn;
	}

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	public String getGrpCategory() {
		return grpCategory;
	}

	public void setGrpCategory(String grpCategory) {
		this.grpCategory = grpCategory;
	}

	public String getStartAction() {
		return startAction;
	}

	public void setStartAction(String startAction) {
		this.startAction = startAction;
	}

	public String getEndAction() {
		return endAction;
	}

	public void setEndAction(String endAction) {
		this.endAction = endAction;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
