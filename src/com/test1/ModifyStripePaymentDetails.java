package com.test1;

public class ModifyStripePaymentDetails {
	private Integer actionId;
	private String actionName;
	private boolean amendType;
	private String closeType;
	private long noDraftCount;
	private boolean sellIndicator;
	private String workflowName;
	private String draftName;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ModifyStripePaymentDetails() {

	}

	public ModifyStripePaymentDetails(Integer actionId, String actionName, boolean amendType, String closeType,
			long noDraftCount, boolean sellIndicator, String workflowName, String draftName, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.actionId = actionId;
		this.actionName = actionName;
		this.amendType = amendType;
		this.closeType = closeType;
		this.noDraftCount = noDraftCount;
		this.sellIndicator = sellIndicator;
		this.workflowName = workflowName;
		this.draftName = draftName;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public boolean isAmendType() {
		return amendType;
	}

	public void setAmendType(boolean amendType) {
		this.amendType = amendType;
	}

	public String getCloseType() {
		return closeType;
	}

	public void setCloseType(String closeType) {
		this.closeType = closeType;
	}

	public long getNoDraftCount() {
		return noDraftCount;
	}

	public void setNoDraftCount(long noDraftCount) {
		this.noDraftCount = noDraftCount;
	}

	public boolean isSellIndicator() {
		return sellIndicator;
	}

	public void setSellIndicator(boolean sellIndicator) {
		this.sellIndicator = sellIndicator;
	}

	public String getWorkflowName() {
		return workflowName;
	}

	public void setWorkflowName(String workflowName) {
		this.workflowName = workflowName;
	}

	public String getDraftName() {
		return draftName;
	}

	public void setDraftName(String draftName) {
		this.draftName = draftName;
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
