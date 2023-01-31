package by.itacademy.lecture14.callable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample {

    public CallableExample()
    {
        // Определяем пул из трех потоков
        ExecutorService executor;
        executor = Executors.newFixedThreadPool(3);

        // Список ассоциированных с Callable задач Future
        List<Future<String>> futures = new ArrayList<>();

        // Создание экземпляра Callable класса
        Callable<String> callable = new CallableClass();

        for (int i = 0; i < 3; i++){
            /*
             * Стартуем возвращаюший результат исполнения в виде объекта Future поток
             */
            Future<String> future = executor.submit(callable);
            futures.add(future);
        }


        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss  ");
        for (Future<String> future : futures){
            try {
                // Выводим в консоль полученное значение
                String text = sdf.format(new Date()) + future.get();
                System.out.println(text);
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            }
        }

        // Останавливаем пул потоков
        executor.shutdown();
    }


    static class CallableClass implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(1000);
            // наименование потока, выполняющего
            // callable задачу
            return Thread.currentThread().getName();
        }
    }

    public static void main(String args[]) {
        new CallableExample();
    }
}
