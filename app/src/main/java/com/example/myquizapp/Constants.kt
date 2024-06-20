package com.example.myquizapp

object Constants {
    fun getQuestions(): ArrayList<setOfQuestions> {
    val questionList = ArrayList<setOfQuestions>()

        val que1 = setOfQuestions(
            id = 1,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Austrialia",
            optionThree = "Armenia",
            optionFour = "Austria",
            correctAnswer = 1
        )
        questionList.add(que1)

        val que2 = setOfQuestions(
            id = 2,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_australia,
            optionOne = "Angola",
            optionTwo = "Austrialia",
            optionThree = "Armenia",
            optionFour = "Austria",
            correctAnswer = 2
        )
        questionList.add(que2)

        val que3 = setOfQuestions(
            id = 3,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_brazil,
            optionOne = "Belarus",
            optionTwo = "Belize",
            optionThree = "Brunei",
            optionFour = "Brazil",
            correctAnswer = 4
        )
        questionList.add(que3)

        val que4 = setOfQuestions(
            id = 4,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_belgium,
            optionOne = "Bahamas",
            optionTwo = "Belgium",
            optionThree = "Barbados",
            optionFour = "Belize",
            correctAnswer = 2
        )
        questionList.add(que4)

        val que5 = setOfQuestions(
            id = 5,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_fiji,
            optionOne = "Gabon",
            optionTwo = "France",
            optionThree = "Fiji",
            optionFour = "Finland",
            correctAnswer = 3
        )
        questionList.add(que5)

        val que6 = setOfQuestions(
            id = 6,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_germany,
            optionOne = "Germany",
            optionTwo = "Georgia",
            optionThree = "Greece",
            optionFour = "Greenland",
            correctAnswer = 1
        )
        questionList.add(que6)

        val que7 = setOfQuestions(
            id = 7,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_denmark,
            optionOne = "Dominica",
            optionTwo = "Egypty",
            optionThree = "Denmark",
            optionFour = "Ethiopia",
            correctAnswer = 3
        )
        questionList.add(que7)

        val que8 = setOfQuestions(
            id = 8,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_india,
            optionOne = "India",
            optionTwo = "Egypty",
            optionThree = "Iran",
            optionFour = "Hungary",
            correctAnswer = 1
        )
        questionList.add(que8)

        val que9 = setOfQuestions(
            id = 9,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_kuwait,
            optionOne = "Iraq",
            optionTwo = "Iran",
            optionThree = "kuwait",
            optionFour = "Dubai",
            correctAnswer = 3
        )
        questionList.add(que9)

        val que10 = setOfQuestions(
            id = 10,
            question = "What country does this flag belongs to?",
            image = R.drawable.ic_flag_of_new_zealand,
            optionOne = "USA",
            optionTwo = "Germany",
            optionThree = "Laos",
            optionFour = "New Zealand",
            correctAnswer = 4
        )
        questionList.add(que10)


        return questionList
    }
}