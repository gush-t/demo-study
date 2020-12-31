package com.example.consumer.entity;

public class MessageTest {

    private String messageNo;

    private String messageName;

    private String messageNumber;

    private String messageContext;


    public MessageTest() {
    }

    public MessageTest(String messageNo, String messageName, String messageNumber, String messageContext) {
        this.messageNo = messageNo;
        this.messageName = messageName;
        this.messageNumber = messageNumber;
        this.messageContext = messageContext;
    }

    @Override
    public String toString() {
        return "MessageTest{" +
                "messageNo='" + messageNo + '\'' +
                ", messageName='" + messageName + '\'' +
                ", messageNumber='" + messageNumber + '\'' +
                ", messageContext='" + messageContext + '\'' +
                '}';
    }

    public String getMessageNo() {
        return messageNo;
    }

    public void setMessageNo(String messageNo) {
        this.messageNo = messageNo;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(String messageNumber) {
        this.messageNumber = messageNumber;
    }

    public String getMessageContext() {
        return messageContext;
    }

    public void setMessageContext(String messageContext) {
        this.messageContext = messageContext;
    }
}
