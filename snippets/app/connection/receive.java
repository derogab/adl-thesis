try {

    // Receives the message which the server sends back
    InputStreamReader isr 
        = new InputStreamReader(socket.getInputStream());
    
    BufferedReader bufferIn = new BufferedReader(isr);

    // In this while the client listens 
    // for the messages sent by the server
    while (mRun) {

        serverMessage = bufferIn.readLine();

        Log.d(TAG, "Message received: " + serverMessage);

    }

} catch (Exception e) {
    Log.e(TAG, "Error: " + e);
}