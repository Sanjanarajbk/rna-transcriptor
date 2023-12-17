class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuffer store = new StringBuffer();
        if (dnaStrand == "") {
            return "";
        }

        for (char c : dnaStrand.toCharArray()) {
            switch (c) {
                case 'C':
                    store.append('G');
                    break;
                case 'G':
                    store.append('C');
                    break;
                case 'T':
                    store.append('A');
                    break;
                case 'A':
                    store.append('U');
                    break;
            }
        }
        return store.toString();


    }
}
