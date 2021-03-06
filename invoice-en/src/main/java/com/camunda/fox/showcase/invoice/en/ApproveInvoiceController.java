package com.camunda.fox.showcase.invoice.en;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.camunda.bpm.engine.cdi.BusinessProcess;

@Model
public class ApproveInvoiceController {

  private boolean approved;

  @Inject
  private BusinessProcess businessProcess;

  public boolean isApproved() {
    return approved;
  }

  public void setApproved(boolean approved) {
    this.approved = approved;
    businessProcess.setVariable("approved", approved);
  }
}
