package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by chengze on 2018/2/14.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
        // arraylist has function get(int) to get the specific object
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
        // arraylist has function remove(Object) to delete the specific object
    }

}
