// Get sensors type
Sensor acc = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
Sensor gyro = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

// Start accelerometer if the device has one
sensorManager.registerListener(sensorEventListener, acc, 50);
    
// Start gyroscope if the device has one
sensorManager.registerListener(sensorEventListener, gyro, 50);