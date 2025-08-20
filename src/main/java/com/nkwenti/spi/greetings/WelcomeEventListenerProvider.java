package com.nkwenti.spi.greetings;

import org.keycloak.events.admin.AdminEvent;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventType;
import org.keycloak.models.KeycloakSession;
import org.jboss.logging.Logger;

public class WelcomeEventListenerProvider implements EventListenerProvider {

    private static final Logger logger = Logger.getLogger(WelcomeEventListenerProvider.class);

    private final KeycloakSession session;

    public WelcomeEventListenerProvider(KeycloakSession session) {
        this.session = session;
    }

    @Override
    public void onEvent(Event event) {
        if (EventType.LOGIN.equals(event.getType())) {
            String username = event.getDetails().get("username");
            logger.infof("welcome \"%s\", thanks for testing Nkwenti's SPI", username);
        }
    }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean b) {
        // Handle admin events if needed
    }

    @Override
    public void close() {
        // Nothing to clean up
    }
}
