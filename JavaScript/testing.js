window.addEventListener("error", (e) => alert(`msg: ${e.message}, ln: ${e.lineno}`));

import "/jsutils.js";
import { random, chance, getEl, wait, isTrue, isFalse, safeEval, RandomNums, ClickRegion, copyToClipboard, dist, Mouse, lsGet, lsSet, quadratic, getQuerys, isFactorable, makeEl, ItemList } from "/jsutils.js";

const li = new ItemList();
document.body.appendChild(li);
li.add("hello", "world");
li.refresh();