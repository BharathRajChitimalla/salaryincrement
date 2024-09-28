package com.example.salaryincrement;

public enum Department {
	DEVELOPER(0.15), MANAGER(0.12), SALES(0.10), OPERATIONS(0.08);

	private final double appraisalFactor;

	Department(double appraisalFactor) {
		this.appraisalFactor = appraisalFactor;
	}

	public double getAppraisalFactor() {
		return appraisalFactor;
	}

}
