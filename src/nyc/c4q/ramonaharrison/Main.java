package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.network.Slack;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        // Post "Hello, world!" to the #bots channel
        myBot.sendMessageToBotsChannel("Tech21");

        // Post a pineapple photo to the #bots channel
        //myBot.sendMessageToBotsChannel("I speak in pigLatin now. English is totally lame");

        myBot.sendPigLatinResponse();


       // while (true) {
           // myBot.sendHomeworkLink();
        //}
    }
}