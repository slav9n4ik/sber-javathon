<template>
    <div @click="getMyLocation" >
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 50 50" height="32px" width="32px">
            <path style="line-height:normal;text-indent:0;text-align:start;text-decoration-line:none;text-decoration-style:solid;text-decoration-color:#000;text-transform:none;block-progression:tb;isolation:auto;mix-blend-mode:normal" d="M 23 0 L 23 4.0976562 C 13.018777 5.046869 5.046869 13.018777 4.0976562 23 L 0 23 L 0 27 L 4.0976562 27 C 5.046869 36.981223 13.018777 44.953131 23 45.902344 L 23 50 L 27 50 L 27 45.902344 C 36.981223 44.953131 44.953131 36.981223 45.902344 27 L 50 27 L 50 23 L 45.902344 23 C 44.953131 13.018777 36.981223 5.046869 27 4.0976562 L 27 0 L 23 0 z M 23 8.1269531 L 23 11 L 27 11 L 27 8.1269531 C 34.805997 9.0369175 40.963083 15.194003 41.873047 23 L 39 23 L 39 27 L 41.873047 27 C 40.963083 34.805997 34.805997 40.963083 27 41.873047 L 27 39 L 23 39 L 23 41.873047 C 15.194003 40.963083 9.0369175 34.805997 8.1269531 27 L 11 27 L 11 23 L 8.1269531 23 C 9.0369175 15.194003 15.194003 9.0369175 23 8.1269531 z" font-weight="400" font-family="sans-serif" white-space="normal" overflow="visible"></path>
        </svg>
    </div>
</template>

<script>

export default {
    name: "location",
    props: {
        view: Object,
    },
    data() {
      return {
          watchUtils: null,
          Locate: null,
          isView: false,
          locateBtn: null,
      };
    },
    methods: {
        getMyLocation() {
            if (navigator){
                if (navigator.geolocation) {
                    navigator.geolocation.getCurrentPosition(
                        position => this.$emit('location', position),
                        () => this.$emit('location', {
                            coords: {
                                longitude: 37.531342,
                                latitude: 55.741432,
                            }
                        }));
                } else {
                    this.$emit('location', {
                        coords: {
                            longitude: 37.531342,
                            latitude: 55.741432,
                        }
                    });
                }
            } else {
                this.$emit('location', {
                    coords: {
                        longitude: 37.531342,
                        latitude: 55.741432,
                    }
                });
            }

        },
        moveToLocation(event) {
            console.log(event);
        }
    },
    mounted() {

    }
}
</script>

<style scoped>

</style>
