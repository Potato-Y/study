<template>
  <div>
    <h1>Welcome to Home</h1>
    <input type="text" v-model="input" />
    <button @click="getData">Get</button>
    <button @click="setData">Set</button>

    <select class="form-control" v-model="region" @change="changeRegion">
      <option :key="index" :value="data.v" v-for="(data, index) in options">
        {{ data.t }}
      </option>
    </select>

    <button @click="buttonCounter++">
      {{ openAndCloase[buttonCounter] }}
    </button>
    <table class="table table-bordered" v-if="tableShow">
      <!-- 
        v-if 와 v-show 의 차이
        v-if 는 false라면 렌더링 자체를 안함
        v-show는 false라도 렌더링을 함. 

        때문에 자주 바뀌는 화면의 경우에는 v-show가 더 적합함
       -->
      <tr :key="i" v-for="(d, i) in options">
        <td>{{ d.v }}</td>
        <td>{{ d.t }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      input: "",
      options: [
        { v: "S", t: "Seoul" },
        { v: "J", t: "Jeju" },
        { v: "B", t: "Busan" },
      ],
      region: "J",
      tableShow: false,
      buttonCounter: 0,
      openAndCloase: ["펼치기", "닫기"],
    };
  },
  methods: {
    getData() {
      alert(this.input);
    },
    setData() {
      this.input = "12345";
    },
    changeRegion() {
      alert(this.region);
    },
  },
  watch: {
    input() {
      console.log("input이 변경됨: " + this.input);
    },
    buttonCounter() {
      if (this.buttonCounter > 1) {
        this.buttonCounter = 0;
      }
      if (this.buttonCounter == 0) {
        this.tableShow = false;
      }
      if (this.buttonCounter == 1) {
        this.tableShow = true;
      }
    },
  },
  beforeCreate() {
    console.log("beforeCreate");
  },
  created() {
    console.log("created");
  },
  beforeMount() {
    console.log("beforeMount");
  },
  mounted() {
    console.log("mounted");
  },
  beforeUpdate() {
    console.log("beforeUpdate");
  },
  updated() {
    console.log("updated");
  },
  beforeDestroy() {
    console.log("beforeDestroy");
  },
  destroyed() {
    console.log("destroyed");
  },
};
</script>
