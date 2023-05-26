package org.example;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

public class SimpleContainer {
    public static void main(String[] args) throws StaleProxyException {
        Runtime runtime=Runtime.instance();
        ProfileImpl profile=new ProfileImpl();
        profile.setParameter(Profile.MAIN_HOST,"localhost");
        AgentContainer agentContainer = runtime.createAgentContainer(profile);
        AgentController IsLandAgent,masterAgent=null;

        masterAgent=agentContainer.createNewAgent(String.valueOf("master"),MasterAgent.class.getName(),new Object[]{});

        for (int i = 0; i< 5; i++){
            IsLandAgent = agentContainer.createNewAgent(String.valueOf("Island "+i), IsLandAgent.class.getName(), new Object[]{});
            IsLandAgent.start();
        }



    }
}
