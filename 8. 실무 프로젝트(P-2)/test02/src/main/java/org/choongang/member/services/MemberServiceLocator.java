package org.choongang.member.services;

import org.choongang.global.Service;
import org.choongang.global.ServiceLocator;
import org.choongang.member.controllers.RequestJoin;

public class MemberServiceLocator implements ServiceLocator {
    private static ServiceLocator instance;

    private MemberServiceLocator() {}

    public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new MemberServiceLocator();
        }

        return instance;
    }

    public JoinService joinService() {
        return new JoinService();
    }

    @Override
    public Service find(String serviceName) {
        Service service = null;
        if (serviceName.equals("join")) service = joinService();

        return service;
    }
}
