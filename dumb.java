class Main {
          public static void main(String[] args) {
            dumbDumb lyrics = new dumbDumb();
            int allCount = 0;


          String[] arr = {
              lyrics.d1, lyrics.d2, lyrics.d3, lyrics.d4, lyrics.d5,
              lyrics.d6, lyrics.d7, lyrics.d8, lyrics.d9, lyrics.d10, lyrics.d11
          };
            for (String array : arr) {
              int count = 0;
              array = array.toLowerCase();
              int index = array.indexOf("Dumb");
              while (index != -1) {
                allCount++;
                count++;
                index = array.indexOf("Dumb", index + 1);
              }
              System.out.println(array);
              System.out.println("덤을 외친 개수 : " + count);

            }
          System.out.println("덤을 외친 총 개수 : " + allCount);
        }
      }
      class dumbDumb {
        String d1 = "Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb ";
        String d2 = "너 땜에 하루 종일 고민하지만 널 어떡해야 좋을지 잘 모르겠어 난 Oh Baby baby baby baby baby you Play me play me play me play me play me 그 눈빛은 날 아찔하고 헷갈리게 해 내 이성적인 감각들을 흩어지게 해 Oh Baby baby baby baby baby you Crazy crazy crazy crazy crazy ";
        String d3 = "마네킹 인형처럼 하나부터 열까지 다 어색하지 평소같이 하면 되는데 또 너만 보면 시작되는 바보 같은 춤 눈 코 입 표정도 팔 다리 걸음도 내 말을 듣지 않죠 Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb 심장의 떨림도 날뛰는 기분도 맘대로 되질 않죠 ";
        String d4 = "Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb";
        String d5 = "낭만적인 영화를 난 꿈꿔왔지만 네 사랑은 내 손에";
        String d6 = "Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Duㄴmb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb";
        String d7 = "You need to Beat It";
        String d8 = "난 너에게서 헤어날 수 없나 봐 ";
        String d9 = "남동생 로봇처럼";
        String d10 = "Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb ";
        String d11 = "Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb Dumb";
      }