package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by chengze on 2018/2/14.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("duplicate tweet!");
        }
        else{
            tweets.add(tweet);
        }
    }

    public ArrayList<Tweet> getTweet(){
        return tweets;
        // arraylist has function get(int) to get the specific object
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public int getCount(){
        return tweets.size();
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
        // arraylist has function remove(Object) to delete the specific object
    }

}
