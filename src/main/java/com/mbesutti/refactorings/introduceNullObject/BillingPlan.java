package com.mbesutti.refactorings.introduceNullObject;

public class BillingPlan {

	public static BillingPlan basic() {
		return new BillingPlan();
	}

	public static BillingPlan special() {
		return new BillingPlan();
	}

}
