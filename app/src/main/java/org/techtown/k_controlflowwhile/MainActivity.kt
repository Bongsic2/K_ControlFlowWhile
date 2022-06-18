package org.techtown.k_controlflowwhile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1.일반적인 while문 사용하기
        var current = 1
        val until = 12
        while (current < until) {
            Log.d("while", "현재 값은 ${current}입니다.")
            current += 1
        }

        // 2. do~while 사용하기
        var game = 1
        val match = 6
        do {
            Log.d("while", "${game}게임 이겼습니다. 우승까지 ${match - game}게임 남았습니다.")
            game += 1
        } while (game < match)

        // 3. while vs do ~ while
        // while 테스트
        var play = 6
        while (play < match) {
            Log.d("while", "---- while 테스트-----")
            play += 1
        }
        // do while 테스트
        do {
            Log.d("while", "---- do ~ while 테스트 ----")
            play += 1
        } while (game < match)

        // 4. 반복문 탈출하기
        for (index in 1..10) {
            Log.d("break", "현재 index는 $index 입니다.")
            if (index > 5)
                break
        }

        // 5. conntinue 다음 반복문으로로
        for (except in 1..10) {
            if (except > 3 && except < 8) {
                continue
            }
            Log.d("continue", "현재 index는 $except 입니다.")
        }
    }
}