package org.apereo.cas.configuration.model.support.pac4j;

import org.apereo.cas.configuration.support.RequiresModule;
import org.apereo.cas.configuration.support.RequiredProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * This is {@link Pac4jIdentifiableClientProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
@RequiresModule(name = "cas-server-support-pac4j-webflow")

@Getter
@Setter
public class Pac4jIdentifiableClientProperties extends Pac4jBaseClientProperties {

    private static final long serialVersionUID = 3007013267786902465L;

    /**
     * The client id.
     */
    @RequiredProperty
    private String id;

    /**
     * The client secret.
     */
    @RequiredProperty
    private String secret;
}
