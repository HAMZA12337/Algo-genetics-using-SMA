package org.example;

import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class AgentServer extends Agent {


    @Override
    protected void setup() {
        System.out.println("*** setup method ***");

        while(true) {
            ACLMessage receivedMSG=receive();
            if (receivedMSG != null) {
                System.out.println(receivedMSG.getContent());
                System.out.println(receivedMSG.getSender().getName());
            }
        }
    }

    @Override
    protected void beforeMove() {
        System.out.println("*** Before move ***");
    }

    @Override
    protected void afterMove() {
        System.out.println("*** after move ***");
    }

    @Override
    protected void takeDown() {
        System.out.println("*** take down ***");
    }
}
