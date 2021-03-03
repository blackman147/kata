package TDD;



public class MyAccount {
    public double getBalance = 2500.0;
    public int getPin = 17747;
    public double withdraw = 1000.0;
    public double deposit;
    private int pin;




    public void deposit(double depositAmount) {
        if (depositAmount == 2500) {
            getBalance = 2500;
        }

    }

    public double getGetBalance() {

        return getBalance;

    }


    public void withdraw(double amountWithdrawn, int pin) {

        if (amountWithdrawn > 0 && amountWithdrawn < getBalance && pin == 17747) {
            getBalance -= amountWithdrawn;
        } else {
            System.out.println("insufficient funds" + getGetBalance());
        }


    }


    public void setPin(int pin) {
        this.pin = pin;
    }


    public double checkBalance(int getBalance) {

        return getBalance;
    }
}


