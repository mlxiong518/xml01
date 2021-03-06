package com;

import java.util.Date;

public class OperationLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_NCRDN_OPERATION_LOG.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_NCRDN_OPERATION_LOG.OPERATION_TYPE
     *
     * @mbg.generated
     */
    private String operationType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_NCRDN_OPERATION_LOG.OPERATION_DETAIL
     *
     * @mbg.generated
     */
    private String operationDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_NCRDN_OPERATION_LOG.OPERATION_OWNER
     *
     * @mbg.generated
     */
    private String operationOwner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_NCRDN_OPERATION_LOG.OPERATION_TIME
     *
     * @mbg.generated
     */
    private Date operationTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TM_NCRDN_OPERATION_LOG.ID
     *
     * @return the value of TM_NCRDN_OPERATION_LOG.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TM_NCRDN_OPERATION_LOG.ID
     *
     * @param id the value for TM_NCRDN_OPERATION_LOG.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TM_NCRDN_OPERATION_LOG.OPERATION_TYPE
     *
     * @return the value of TM_NCRDN_OPERATION_LOG.OPERATION_TYPE
     *
     * @mbg.generated
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TM_NCRDN_OPERATION_LOG.OPERATION_TYPE
     *
     * @param operationType the value for TM_NCRDN_OPERATION_LOG.OPERATION_TYPE
     *
     * @mbg.generated
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TM_NCRDN_OPERATION_LOG.OPERATION_DETAIL
     *
     * @return the value of TM_NCRDN_OPERATION_LOG.OPERATION_DETAIL
     *
     * @mbg.generated
     */
    public String getOperationDetail() {
        return operationDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TM_NCRDN_OPERATION_LOG.OPERATION_DETAIL
     *
     * @param operationDetail the value for TM_NCRDN_OPERATION_LOG.OPERATION_DETAIL
     *
     * @mbg.generated
     */
    public void setOperationDetail(String operationDetail) {
        this.operationDetail = operationDetail == null ? null : operationDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TM_NCRDN_OPERATION_LOG.OPERATION_OWNER
     *
     * @return the value of TM_NCRDN_OPERATION_LOG.OPERATION_OWNER
     *
     * @mbg.generated
     */
    public String getOperationOwner() {
        return operationOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TM_NCRDN_OPERATION_LOG.OPERATION_OWNER
     *
     * @param operationOwner the value for TM_NCRDN_OPERATION_LOG.OPERATION_OWNER
     *
     * @mbg.generated
     */
    public void setOperationOwner(String operationOwner) {
        this.operationOwner = operationOwner == null ? null : operationOwner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TM_NCRDN_OPERATION_LOG.OPERATION_TIME
     *
     * @return the value of TM_NCRDN_OPERATION_LOG.OPERATION_TIME
     *
     * @mbg.generated
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TM_NCRDN_OPERATION_LOG.OPERATION_TIME
     *
     * @param operationTime the value for TM_NCRDN_OPERATION_LOG.OPERATION_TIME
     *
     * @mbg.generated
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
}