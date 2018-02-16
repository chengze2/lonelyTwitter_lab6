package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

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

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");

        tweets.add(tweet);
        Tweet returnTweet = tweets.getTweet(0);
        // TweetList class has not this function
        assertEquals(returnTweet.getDate(), tweet.getDate());
        // returnTweet: get date from arraylist tweets
        // tweet: get date from current tweet
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
