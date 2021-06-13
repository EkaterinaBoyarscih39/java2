package com.JKate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Homework2 {
    //Задача 1. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
    public static void task_1(String[] args) {
        ArrayList<String> undistinct = new ArrayList<String>();
        Collections.addAll(undistinct, "yes", "or", "none", "no", "not", "yes", "no", "kek", "lol");
    }
    public static <T> Collection<T> removeDuplicates(Collection<T> collection1){
        return new HashSet<>(collection1);
    }

    //Задача 2. Напишите метод, который получает на вход Map<K, V> и возвращает Map, где ключи и значения поменяны местами.
    private static <Key_1, Val_1> Map<Val_1, Collection<Key_1>> inverse(Map<? extends Key_1, ? extends Val_1> map) {
        Map<Val_1, Collection<Key_1>> task_2_result = new HashMap<>();
        Set<Key_1> keys = (Set<Key_1>) map.keySet();

        for (Key_1 key : keys) {
            Val_1 value = map.get(key);
            task_2_result.compute(value, (vals, keys_1) -> {
                if (keys_1 == null) {
                    keys_1 = new HashSet<>();
                }
                keys_1.add(key);
                return keys_1;
            });
        }
        return task_2_result;
    }
    // Задача 3. Необходимо написать функцию, которая на вход получает массив строк, в формате имя_игрока количество_очков.
    public static void task_3() {
        String[] gamers = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6",
                                 "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};
        String[] gamers_list;
        String[] winner_name= null;
        int[] max = 10;
        for(int i = 0; i < gamers.length; i++)
        {
            gamers_list = arr[i].split(" ");
            int[] points = Integer.parseInt(gamers_list[1]);
        }
        for(int i = 0; i < points.size(); i++) 
        {
			if(points = max) {
			   winner_name = arr[i].split(" ");
		}
        System.out.println("Поздравляем с победой, "+winner_name[0]+"!");
    }
}
