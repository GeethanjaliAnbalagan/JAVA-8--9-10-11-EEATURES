package com.java.reactivestreamsusingFlowAPI;

import java.util.concurrent.Flow;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;

class MySubscriber<T>implements Flow.Subscriber<T> {
   private Flow.Subscription subscription;
   @Override
   public void onSubscribe(Flow.Subscription subscription) {
      this.subscription = subscription;
      this.subscription.request(1);
   }
   @Override
   public void onNext(T item) {
      System.out.println(item);
      subscription.request(1);
   }
   @Override
   public void onError(Throwable throwable) {
      throwable.printStackTrace();
   }
   @Override
   public void onComplete() {
      System.out.println("Done");
   }
}

// main class
public class FlowTest {
   public static void main(String args[]) {
      List<String> items = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
      SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
      publisher.subscribe(new MySubscriber<>());
      items.forEach(s -> {
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         publisher.submit(s);
      });
      publisher.close();
   }
}