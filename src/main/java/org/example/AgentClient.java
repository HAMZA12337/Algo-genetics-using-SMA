package org.example;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.tools.sniffer.Message;

public class AgentClient  extends Agent {

    @Override
    protected void setup() {
        System.out.println("*** setup method ***");
        String org1 =(String)getArguments()[0];
        String org2 =(String)getArguments()[1];

        System.out.println(org1+"   "+org2);
        ACLMessage message = new ACLMessage(ACLMessage.REQUEST);
        message.setContent("bonjour ce message c est pour demander un service ");
        message.addReceiver(new AID("server",AID.ISLOCALNAME)) ;


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