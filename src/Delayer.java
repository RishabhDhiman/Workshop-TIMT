class Delayer {
    void callAPI(CallbackInterface callbackinterface) {
        new Thread(() -> {
            try {
                System.out.println("Asynchronous execution started");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            callbackinterface.onCall("This is from callback using Asynchronous Execution");
        }).start();
    }

    String getData() {
        System.out.println("All Task Schedules now waiting");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "This is from Synchronous Execution";
    }
}
