package com.fintechlabs;


import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.fintechlabs.actors.MasterActor;
import com.fintechlabs.messages.Result;

public class ActorApplication {

    public static void main(String[] args) throws Exception {
        System.out.println("ActorApplication World");

        ActorSystem _system = ActorSystem.create("MapReduceApp");

        ActorRef master = _system.actorOf(new Props(MasterActor.class), "master");

        master.tell("The quick brown fox tried to jump over the lazy dog and fell on the dog");
        master.tell("Dog is man's best friend");
        master.tell("Dog and Fox belong to the same family");

        Thread.sleep(500);

        master.tell(new Result(), null);

        Thread.sleep(500);

        _system.shutdown();
        System.out.println("Java done!");
    }

}
