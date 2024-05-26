package org.choongang.global;

public interface ServiceLocator {
    Service find(String serviceName);
}
