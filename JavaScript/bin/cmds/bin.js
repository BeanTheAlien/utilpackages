import * as fs from "fs";
import * as readline from "readline";

export default async function(arg) {
    const style = arg[0] ?? "cjs";
    console.log("Creating bin dir...");
    fs.mkdirSync("bin");
    console.log("Creating bin/cmds dir...");
    fs.mkdirSync("bin/cmds");
    console.log("Writing bin file...");
    fs.writeFileSync("bin/bin.js", `#!/usr/bin/env node
const fs = require("fs");
const path = require("path");

const [,, cmd, ...args] = process.argv;
const commandsDir = path.join(__dirname, "cmds");

const commands = Object.fromEntries(
    fs.readdirSync(commandsDir)
        .map(file => [file.replace(".js", ""), () => require(path.join(commandsDir, file))])
);

if(commands[cmd]) {
    const module = commands[cmd]();
    module.default(args);
} else {
    console.log(\`Unknown command: \${cmd}\`);
}`
    );
    console.log("Done!");
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });
    const ask = (q) => new Promise(res => rl.question(q, res));
    if((await ask("Add to package.json? (y/n): ")).toLowerCase() == "y") {
        const x = await ask("Enter names (seperate by ,): ");
        const pkg = JSON.parse(fs.readFileSync("package.json", "utf8"));
        pkg["bin"] = {};
        for(const y of x.split(",")) pkg["bin"][y.trim()] = "bin/bin.js";
        fs.writeFileSync("package.json", JSON.stringify(pkg));
    }
    rl.close();
}