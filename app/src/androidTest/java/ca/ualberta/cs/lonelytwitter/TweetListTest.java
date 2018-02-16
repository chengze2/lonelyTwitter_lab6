package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by chengze on 2018/2/14.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        // create object
        Tweet tweet = new NormalTweet("adding a tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        try{
            tweets.add(tweet);
        }
        catch(Exception e){
            assertEquals("duplicate tweet!", e);
        }
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
        Tweet tweet = new NormalTweet("adding a tweet");
        Tweet tweet2 = new NormalTweet("adding second tweet");
        tweets.add(tweet);
        tweets.add(tweet2);
        tweetList.add(tweet);
        tweetList.add(tweet2);

        ArrayList<Tweet> returnTweetList = tweets.getTweet();
        // TweetList class has not this function
        assertEquals(returnTweetList, tweetList);
        // returnTweet: get date from arraylist tweets
        // tweet: get date from current tweet
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");

        assertFalse(tweets.hasTweet(tweet));
        // before add the tweet into arraylist; it should be false
        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
        // after add the tweet into arraylist; it should be true
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        assertEquals(tweets.getCount(), 0);
        Tweet tweet = new NormalTweet("adding a tweet");
        tweets.add(tweet);
        assertEquals(tweets.getCount(), 1);
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        // TweetList class has not this function
        assertFalse(tweets.hasTweet(tweet));
    }

}
