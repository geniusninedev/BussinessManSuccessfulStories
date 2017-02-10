package com.geniusnine.android.bussinessmansuccessfulstories;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuotesListDetails  extends AppCompatActivity {
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes_list_details);
        List = new String[]{"“The critical ingredient is getting off your butt " +
                "and doing something. It’s as simple as that. A lot of people have ideas, but " +
                "there are few who decide to do something about them now. Not tomorrow. Not next " +
                "week. But today. The true entrepreneur is a doer, not a dreamer","\"Do (Or) do not. There is no try.","“To any entrepreneur\n: if you want to do it, do it now." +
                "If you don’t, you’re going to regret it.”","“It’s not about ideas. It’s about making ideas " +
                "happen.”","“I’ve missed more than 9,000 shots in my career. " +
                "I’ve lost almost 300 games. 26 times I’ve been trusted to take the game's " +
                "winning shot and missed. I’ve failed over and over and over again in my life and " +
                "that's why I succeed.”","“There’s nothing wrong with staying small. You can " +
                "do big things with a small team.”","“Ideas are easy. Implementation is hard.” ","“If you just work on stuff that you like and you’re " +
                "passionate about, you don’t have to have a master plan with how things will play " +
                "out.”","\"The best time to plant a tree was 20 years ago. " +
                "The second best time is now.\"","“Never give in–never, never, never, never, in " +
                "nothing great or small, large or petty, never give in except to convictions of " +
                "honour and good sense. Never yield to force; never yield to the apparently " +
                "overwhelming might of the enemy.”","“There’s lots of bad reasons to start a company. " +
                "But there’s only one good, legitimate reason, and I think you know what it is: " +
                "it’s to change the world.”","“The secret to successful hiring is this: look for" +
                "the people who want to change the world.”","“The price of success is hard work, dedication to " +
                "the job at hand, and the determination that whether we win or lose, we have " +
                "applied the best of ourselves to the task at hand.” ","\"When everything seems to be going against you, " +
                "remember that the airplane takes off against the wind, not with it.\"","“If you’re not a risk taker, you should get the " +
                "hell out of business.”","“Watch, listen, and learn. You can’t know it all" +
                "yourself. Anyone who thinks they do is destined for mediocrity.”","“Always deliver more than expected.” —Larry Page, co-founder of Google.","\"Twenty years from now, you will be more " +
                "disappointed by the things that you didn't do than by the ones you did do, so " +
                "throw off the bowlines, sail away from safe harbor, catch the trade winds in " +
                "your sails. Explore, Dream, Discover.\"","“You shouldn’t focus on why you can’t do something, which is what most " +
                "people do. You should focus on why perhaps you can, and be one of the " +
                "exceptions.” - Steve Case, co-founder of AOL.","\"A person who never made a mistake never tried anything new.\" - Albert " +
                "Einstein, physicist","“Risk more than others think is safe. Dream more than others think is " +
                "practical.” - Howard Schultz, CEO of Starbucks.","“I’m convinced that about half of what separates" +
                "the successful entrepreneurs from the non-successful ones is pure perseverance.”","“Be undeniably good. No marketing effort or social " +
                "media buzzword can be a substitute for that.”","“The way to get started is to quit talking and begin doing.” - Walt Disney, " +
                "co-founder of the Walt Disney Company.","\"You miss 100 percent of the shots you don't take.\" ","“Do not be embarrassed by your failures, learn " +
                "from them and start again.”","“It’s almost always harder to raise capital than you thought it would be, " +
                "and it always takes longer. So plan for that.”","“If you don't know what to do with your life, do " +
                "something that saves lives. The world is full of of people in need, be the part " +
                "of their life that fills that need.”","\"It does not matter how slowly you go as long as " +
                "you do not stop.\"","“I hate how many people think, “glass half-empty” " +
                "when their glass is really four-fifths full. I’m grateful when I have one drop " +
                "in the glass because I know exactly what to do with it.”","“It's hard to beat a person who never gives up.”","“For all of the most important things, the timing " +
                "always sucks. Waiting for a good time to quit your job? The stars will never " +
                "align and the traffic lights of life will never all be green at the same time. " +
                "The universe doesn't conspire against you, but it doesn't go out of its way to " +
                "line up the pins either. Conditions are never perfect. \"Someday\" is a disease " +
                "that will take your dreams to the grave with you. Pro and con lists are just as " +
                "bad. If it's important to you and you want to do it \"eventually,\" just do it and " +
                "correct course along the way.”","“Fail often so you can succeed sooner.” - Tom Kelley, Ideo partner.","“We are currently not planning on conquering the " +
                "world.”","“Timing, perseverance, and ten years of trying will eventually make you look" +
                "like an overnight success.” - Biz Stone, co-founder of Twitter.","\"You may be disappointed if you fail, but you are " +
                "doomed if you don't try.\"","“The media wants overnight successes (so they have " +
                "someone to tear down). Ignore them. Ignore the early adopter critics that never " +
                "have enough to play with. Ignore your investors that want proven tactics and " +
                "predictable instant results. Listen instead to your real customers, to your " +
                "vision and make something for the long haul. Because that's how long it's going " +
                "to take, guys.","“When you cease to dream you cease to live”","“Don’t worry about funding if you don’t need it. " +
                "Today it’s cheaper to start a business than ever.”","“If you can't fly then run, if you can't run then" +
                "walk, if you can't walk then crawl, but whatever you do you have to keep moving " +
                "forward.”","\"Your most unhappy customers are your greatest source of learning.\" – Bill " +
                "Gates, co-founder of Microsoft.","\"I have not failed. I’ve just found 10,000 ways " +
                "that won’t work.\"","\"Entrepreneurship is neither a science nor an art. " +
                "It is a practice.\"","\"In the modern world of business, it is useless to " +
                "be a creative, original thinker unless you can also sell what you create.\"","“It doesn’t matter how many times you fail. It " +
                "doesn’t matter how many times you almost get it right. No one is going to know " +
                "or care about your failures, and neither should you. All you have to do is learn " +
                "from them and those around you because all that matters in business is that you " +
                "get it right once. Then everyone can tell you how lucky you are.”","\"Success is how high you bounce after you hit " +
                "bottom.\"","“I hate how many people think, “glass half-empty” " +
                "when their glass is really four-fifths full. I’m grateful when I have one drop " +
                "in the glass because I know exactly what to do with it.”","“It's hard to beat a person who never gives up.”","“For all of the most important things, the timing " +
                "always sucks. Waiting for a good time to quit your job? The stars will never " +
                "align and the traffic lights of life will never all be green at the same time. " +
                "The universe doesn't conspire against you, but it doesn't go out of its way to " +
                "line up the pins either. Conditions are never perfect. \"Someday\" is a disease " +
                "that will take your dreams to the grave with you. Pro and con lists are just as " +
                "bad. If it's important to you and you want to do it \"eventually,\" just do it and " +
                "correct course along the way.”"};


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        viewPager = (ViewPager) findViewById(R.id.quotes);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(QuotesListDetails.this, List);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);


    }

}