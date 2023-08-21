//redisClient.js
require("dotenv-safe").config();
const redis = require('redis');
let client = null;

function getConnection() {

    if (this.client) return this.client;  
    this.client = redis.createClient({url: 'rediss://user:pass@host:6379'});
    this.client.on("error", (error) => {
        logger('system', error);
    })

    this.client.connect();

    return this.client;
}

function getValue(key) {
    return getConnection().get(key);
}

module.exports = { getValue }