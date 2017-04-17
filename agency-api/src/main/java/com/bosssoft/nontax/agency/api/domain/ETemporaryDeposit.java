package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

public class ETemporaryDeposit implements Serializable {

	private static final long serialVersionUID = -967068586665518231L;
	
	private String id;
    private String agencyIdCode;
    private String bankCode;
    private String bankName;
    private String payName;
    private String payAcct;
    private String payOpenBank;
    private String amount;
    private String balance;
    private String date;
    private String time;
    private String memo;
    private String serialNo;
    private String addWord;

    public String getAgencyIdCode() {
        return agencyIdCode;
    }

    public void setAgencyIdCode(String agencyIdCode) {
        this.agencyIdCode = agencyIdCode;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getPayAcct() {
        return payAcct;
    }

    public void setPayAcct(String payAcct) {
        this.payAcct = payAcct;
    }

    public String getPayOpenBank() {
        return payOpenBank;
    }

    public void setPayOpenBank(String payOpenBank) {
        this.payOpenBank = payOpenBank;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setAddWord(String addWord) {
        this.addWord = addWord;
    }

    public String getAddWord() {
        return addWord;
    }
}
