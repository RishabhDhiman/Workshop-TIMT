class ReferenceVsObject {

    public static void main(String[] args) {
        Delayer delayer = new Delayer();
        System.out.println("Started Heavy Intensive Task");
        delayer.callAPI(new CallbackInterface() {
            @Override
            public void onCall(String message) {
                System.out.println(message);
            }
        });
        String data = delayer.getData();
        System.out.println(data);
    }
}












