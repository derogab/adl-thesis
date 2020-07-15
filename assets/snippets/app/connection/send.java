// Buffer to send the message to the server
OutputStreamWriter osw 
    = new OutputStreamWriter(socket.getOutputStream());

BufferedWriter bw = new BufferedWriter(osw);
PrintWriter bufferOut = new PrintWriter(bw, true);

// Send message
try {
    bufferOut.println(MESSAGE_TO_SEND);
    bufferOut.flush();
}
catch (Exception e) {
    Log.e(TAG, "Error: " + e);
}