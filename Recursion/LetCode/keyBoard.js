// var findWords = function (words) {

//     let st1 = "qwertyuiop";
//     let st2 = "asdfghjkl";
//     let st3 = "zxcvbnm";
//     let ans = [];
//     words.forEach((ele) => {
//         let stor = "";
//         let isCon = true;
//         let flag1 = true;
//         let flag2 = true;
//         let flag3 = true;           // qwwewm


//             for (let i = 0; i < ele.length; i++) {
//                 let alpha = ele[i].toLowerCase();
//                 if (st1.includes(alpha) && flag1) {
//                     console.log("str 1", alpha)
//                     stor += ele[i];
//                     isCon = true;
//                     continue;
//                 } else if (flag1) {
//                     stor = ""
//                     isCon = false;
//                     flag1 = false;
//                     // break;
//                 }

//                 if (st2.includes(alpha) && flag2) {
//                     console.log("str 2", alpha)
//                     stor += ele[i];
//                     isCon = true;
//                     continue;

//                 } else if (flag2) {
//                     stor = ""
//                     isCon = false;
//                     flag2 = false
//                     // break;
//                 }

//                 if (st3.includes(alpha) && flag3) {
//                     console.log("str 3", alpha)
//                     stor += ele[i];
//                     isCon = true;
//                     continue;

//                 } else if (flag3) {
//                     stor = ""
//                     isCon = false;
//                     flag3 = false;
//                     // break;
//                 }

//             }
//             if (isCon) {
//                 ans.push(stor);
//             }

//     })
//     console.log(ans);
// };



// findWords(["a", "qwwewm"]);

var findWords = function (words) {
    const rows = ["qwertyuiop", "asdfghjkl", "zxcvbnm"];
    const ans = [];

    words.forEach((word) => {
        const lowerWord = word.toLowerCase();

        for (const row of rows) {
            let isInRow = true;
            for (let i = 0; i < lowerWord.length; i++) {  //["Hello", "Alaska", "Dad", "Peace"]
                if (!row.includes(lowerWord[i])) {
                    isInRow = false;
                    break;
                }
            }

            if (isInRow) {
                ans.push(word);
                break;
            }
        }
    });

    console.log(ans);
    return ans;
};

// Example usage:
findWords(["Hello", "Alaska", "Dad", "Peace"]);  // Output: ["Alaska", "Dad"]
findWords(["omk"]);  // Output: []
findWords(["adsdf", "sfd", "a", "qwwewm"]);  // Output: ["adsdf", "sfd"]
