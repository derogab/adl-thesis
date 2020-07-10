public void onSensorChanged(SensorEvent event) {

    if(event.sensor.getType() == Sensor.TYPE_GYROSCOPE) {
        
        // Get values
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        // and send data
        sendGyroscopeData(x, y, z);

    }
    if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
        
        // Get values
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        // and send data
        sendAccelerometerData(x, y, z);
        
    }

}