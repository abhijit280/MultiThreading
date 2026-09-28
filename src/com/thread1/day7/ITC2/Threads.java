package com.thread1.day7.ITC2;

class OrderThread extends Thread {

    Order order;

    public OrderThread(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        order.order();
    }
}


class PaymentThread extends Thread {

    Payment payment;

    public PaymentThread(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void run() {
        payment.doPayment();
    }
}


class BillThread extends Thread {

    BillGenatrate bill;

    public BillThread(BillGenatrate bill) {
        this.bill = bill;
    }

    @Override
    public void run() {
        bill.generateBill();
    }
}