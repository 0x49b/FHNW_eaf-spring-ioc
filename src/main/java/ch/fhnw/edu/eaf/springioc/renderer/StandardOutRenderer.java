package ch.fhnw.edu.eaf.springioc.renderer;

import ch.fhnw.edu.eaf.springioc.provider.MessageProvider;

public class StandardOutRenderer implements MessageRenderer {

    private MessageProvider mp;

    @Override
    public void render() {
        System.out.println(mp.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        mp = messageProvider;
    }
}
