// Set TTS object
TextToSpeech textToSpeech = new TextToSpeech(this, 
    new TextToSpeech.OnInitListener() {
    
    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {

            Locale curr = new Locale(getString(R.string.current_lang));
            int ttsLang = textToSpeech.setLanguage(curr);

            if (ttsLang == TextToSpeech.LANG_MISSING_DATA
                    || ttsLang == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("[TTS]", "The Language is not supported!");
            } else {
                Log.i("[TTS]", "Language Supported.");
            }
            Log.i("[TTS]", "Initialization success.");
        } else {
            Log.e("[TTS]", "Initialization failed!");
        }
    }

});
// and then
int speechStatus 
    = textToSpeech.speak(tts, TextToSpeech.QUEUE_FLUSH, null);

if (speechStatus == TextToSpeech.ERROR) {
    Log.e("[TTS]", "Error in converting Text to Speech!");    
}