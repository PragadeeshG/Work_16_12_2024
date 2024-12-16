package com.test1;

public class StripePaymentDetailsClosure {
	private Integer crId;
	private String refName;
	private String closeRoute;
	private boolean onlymaker;
	private boolean onlyChecker;
	private boolean deleteOnSuccess;
	private boolean autoApproval;
	private Integer autoApprovalStep;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public StripePaymentDetailsClosure() {

	}

	public StripePaymentDetailsClosure(Integer crId, String refName, String closeRoute, boolean onlymaker,
			boolean onlyChecker, boolean deleteOnSuccess, boolean autoApproval, Integer autoApprovalStep,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.crId = crId;
		this.refName = refName;
		this.closeRoute = closeRoute;
		this.onlymaker = onlymaker;
		this.onlyChecker = onlyChecker;
		this.deleteOnSuccess = deleteOnSuccess;
		this.autoApproval = autoApproval;
		this.autoApprovalStep = autoApprovalStep;
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

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getCloseRoute() {
		return closeRoute;
	}

	public void setCloseRoute(String closeRoute) {
		this.closeRoute = closeRoute;
	}

	public boolean isOnlymaker() {
		return onlymaker;
	}

	public void setOnlymaker(boolean onlymaker) {
		this.onlymaker = onlymaker;
	}

	public boolean isOnlyChecker() {
		return onlyChecker;
	}

	public void setOnlyChecker(boolean onlyChecker) {
		this.onlyChecker = onlyChecker;
	}

	public boolean isDeleteOnSuccess() {
		return deleteOnSuccess;
	}

	public void setDeleteOnSuccess(boolean deleteOnSuccess) {
		this.deleteOnSuccess = deleteOnSuccess;
	}

	public boolean isAutoApproval() {
		return autoApproval;
	}

	public void setAutoApproval(boolean autoApproval) {
		this.autoApproval = autoApproval;
	}

	public Integer getAutoApprovalStep() {
		return autoApprovalStep;
	}

	public void setAutoApprovalStep(Integer autoApprovalStep) {
		this.autoApprovalStep = autoApprovalStep;
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
