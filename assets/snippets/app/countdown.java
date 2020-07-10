// Set the countdown
myCountdown = new CountDownTimer(n * 1000, 1000) { // n seconds
    @Override
    public void onTick(long millisUntilFinished) {
        // callback each second
    }

    @Override
    public void onFinish() {
        // callback on finish
    }
};

myCountdown.start();